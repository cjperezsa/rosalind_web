(ns rosalind_web.routes.home
  (:use compojure.core hiccup.element)
  (:require [rosalind_web.views.layout :as layout]
            [rosalind_web.util :as util]))

(defn home-page [] 
  (layout/common
    (util/md->html "/md/docs.md")))

(defn about-page []
  (layout/common
   "this is the story of rosalind_web... work in progress"))

(defroutes home-routes 
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))