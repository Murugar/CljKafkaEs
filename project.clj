(defproject CljKStreamES "0.3.0"
  :description "Clojure Kafka Topic Elasticsearch"
  :url "http://example.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.3.442"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/tools.cli "0.3.5"]
                 ; elasticsearch
                 [clojurewerkz/elastisch "2.2.1"]
                 ; kafka
                 [ymilky/franzy "0.0.2-SNAPSHOT"]
                 [ymilky/franzy-admin "0.0.1"]
                 [ymilky/franzy-nippy "0.0.1"]
                 [ymilky/franzy-fressian "0.0.1"]
                 [ymilky/franzy-json "0.0.1"]
                 ; logging
                 [com.taoensso/timbre "4.4.0"]
                 [org.clojure/tools.logging "0.2.6"]
                 [ch.qos.logback/logback-classic "1.1.3"]]
  :aot :all
  :main CljKStreamES.core
  :profiles {:uberjar {:aot :all}}
  ;; As above, but for uberjar.
  :uberjar-name "CljKStreamES.jar"
  :jvm-opts ["-Xmx2g" "-server"])
