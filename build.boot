(set-env!
 :source-paths   #{"src"}
 :resource-paths #{"resources"}
 :dependencies '[
                 [org.clojure/clojure                       "1.9.0"  :scope "provided"]
                 [org.clojure/core.async                    "0.4.490"]
                 [org.clojure/clojurescript "1.9.562"]
                 [adzerk/boot-reload        "0.5.1"      :scope "test"]
                 [adzerk/boot-cljs      "2.0.0" :scope "test"]
                 [com.taoensso/sente        "1.14.0-RC2"] ; <--- Sente
                 [com.taoensso/timbre       "4.10.0"]

                 [http-kit                  "2.3.0"]

                 [ring                      "1.7.1"]
                 [ring/ring-defaults        "0.3.2"] ; Includes `ring-anti-forgery`, etc.

                 [compojure                 "1.6.1"] ; Or routing lib of your choice
                 [hiccup                    "1.0.5"] ; Optional, just for HTML

   ;;; Transit deps optional; may be used to aid perf. of larger data payloads
   ;;; (see reference example for details):
                 [com.cognitect/transit-clj  "0.8.313"]
                 [com.cognitect/transit-cljs "0.8.256"]

                 [onetom/boot-lein-generate "0.1.3"]])

(require
 '[adzerk.boot-cljs      :refer [cljs]]
 '[adzerk.boot-reload    :refer [reload]]
 'example.server
 'boot.lein)

(deftask generate []
  (comp
    (boot.lein/generate)))

(deftask run []
  (with-pass-thru _
    (example.server/-main)))

(deftask dev
  []
  (comp
   (watch)
   (cljs :source-map true)
   (reload)
   (run)
   ))
