(ns gengen.core
  (:require [instaparse.core :as insta])
  (:gen-class))

(defn -main
  [& args]
  (let [in (slurp *in*)]
    (print (insta/transform (cull) (depscan in))))
  (flush)) ; Hopefully I can avoid spending hours of my life here.


(def whitespace (insta/parser
                  "whitespace ::= (spaces | comment)+
                   comment ::= #'(?s)<!--.*?-->'
                   spaces ::= #'[\\s\\v]+'"))

(def depscan (insta/parser "resources/grammars/proofwiki-simple.ebnf" :options {:auto-whitespace whitespace}))

(insta/parse depscan
             (slurp "resources/samples/01-Area_of_Triangle_in_Terms_of_Circumradius.wikitext.txt")
             )
(def sampletree (insta/parse depscan (slurp "resources/samples/01-Area_of_Triangle_in_Terms_of_Circumradius.wikitext.txt")))

(insta/visualize sampletree)

(defn cull
  []
  {:html_comment ''
   :word str
   :header ''
   :header_text ''
   :claim ''
   :section ''
   :section-content ''
   :inlink str
   :content_char ''
   :whitespace ''
   :reserved '' }
  )
