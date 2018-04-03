(defproject aleph-issue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [aleph "0.4.5-alpha6"]]
  :main ^:skip-aot aleph-issue.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
