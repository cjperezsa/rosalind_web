(ns rosalind_web.handler
  (:use rosalind_web.routes.home
        compojure.core)  
  (:require [noir.util.middleware :as middleware]
            [compojure.route :as route]))

(defroutes app-routes  
  (route/resources "/")
  (route/not-found "Not Found"))

(defn init
  "init will be called once when
   app is deployed as a servlet on 
   an app server such as Tomcat
   put any initialization code here"
  []
  (println "rosalind_web started successfully..."))

(defn destroy []
  (println "shutting down..."))

;;append your application routes to the all-routes vector
(def all-routes [home-routes app-routes])
(def app (middleware/app-handler all-routes))
(def war-handler (middleware/war-handler app))
