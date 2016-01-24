(ns gengen.core
  (:require [instaparse.core :as insta])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def whitespace (insta/parser
                  "whitespace ::= (spaces | comment)+
                   comment ::= #'(?s)<!--.*?-->'
                   spaces ::= #'[\\s\\v]+'"))

(def depscan (insta/parser "resources/grammars/proofwiki-simple.ebnf" :options {:auto-whitespace whitespace}))

(def sampletree (insta/parse depscan (slurp "resources/samples/01-Area_of_Triangle_in_Terms_of_Circumradius.wikitext.txt")))

(insta/visualize sampletree)
