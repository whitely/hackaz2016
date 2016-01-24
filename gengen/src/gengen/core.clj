(ns gengen.core
  (:require [instaparse.core :as insta])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(System/getProperty "java.vm.version")

(def shortspace (insta/parser "whitespace ::= #'[\\s+&&[^\n]]+'"))
(def tallspace (insta/parser "whitespace ::= #'[\\s\\n]+'"))

(def depscan (insta/parser "resources/grammars/proofwiki-simple.ebnf" :options {:auto-whitespace tallspace}))

(insta/parse depscan (slurp "resources/samples/01-Area_of_Triangle_in_Terms_of_Circumradius.wikitext.txt"))
