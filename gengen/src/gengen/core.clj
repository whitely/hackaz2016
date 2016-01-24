(ns gengen.core
  (:require [instaparse.core :as insta])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def depscan (insta/parser "resources/pw-dep.ebnf"))

(insta/parse depscan (slurp "resources/pw-dep.ebnf"))

