(defproject
  boot-project
  "0.0.0-SNAPSHOT"
  :repositories
  [["clojars" {:url "https://clojars.org/repo/"}]
   ["maven-central" {:url "https://repo1.maven.org/maven2"}]]
  :dependencies
  [[org.clojure/clojure "1.9.0" :scope "provided"]
   [org.clojure/core.async "0.4.490"]
   [org.clojure/clojurescript "1.9.562"]
   [adzerk/boot-reload "0.5.1" :scope "test"]
   [adzerk/boot-cljs "2.0.0" :scope "test"]
   [com.taoensso/sente "1.14.0-RC2"]
   [com.taoensso/timbre "4.10.0"]
   [http-kit "2.3.0"]
   [ring "1.7.1"]
   [ring/ring-defaults "0.3.2"]
   [compojure "1.6.1"]
   [hiccup "1.0.5"]
   [com.cognitect/transit-clj "0.8.313"]
   [com.cognitect/transit-cljs "0.8.256"]
   [onetom/boot-lein-generate "0.1.3"]]
  :source-paths
  ["src"]
  :resource-paths
  ["resources"])