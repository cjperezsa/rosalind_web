(defproject rosalind_web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [lib-noir "0.3.4"]
                 [compojure "1.1.3"]
                 [hiccup "1.0.2"]
                 [ring-server "0.2.5"]                 
                 [com.taoensso/timbre "1.1.0"]
                 [com.taoensso/tower "1.0.0"]
                 [markdown-clj "0.9.18"]]  
  :plugins [[lein-ring "0.8.0"]]
  :ring {:handler rosalind_web.handler/war-handler
         :init    rosalind_web.handler/init
         :destroy rosalind_web.handler/destroy}  
  :profiles
  {:production {:ring {:open-browser? false 
                       :stacktraces?  false 
                       :auto-reload?  false}}
   :dev {:dependencies [[ring-mock "0.1.3"]
                        [ring/ring-devel "1.1.0"]]}}
  :min-lein-version "2.0.0")