(defproject gengen "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://mirror.reflect.wiki"
  :license {:name "Affero GNU General Public License (version 3.0+)"
            :url "http://www.gnu.org/licenses/agpl.html"}
  :dependencies [ [org.clojure/clojure "1.8.0"]
                  [instaparse "1.4.1"]
                  [rhizome    "0.2.5"]
                  [ubergraph "0.1.9"]]
  :main ^:skip-aot gengen.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
