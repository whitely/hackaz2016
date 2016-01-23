(defproject gengen "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [ [org.clojure/clojure "1.8.0"]
                  [ubergraph "0.1.9"]
                  [instaparse "1.4.1"]
                  [rhizome "0.2.5"]
                  [aysylu/loom "0.5.4"]
                  [org.clojure/core.logic "0.8.10"]
                  [jiraph "0.8.2"]
                  [clj-http "2.0.1"]]
  :main ^:skip-aot gengen.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
