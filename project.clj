(defproject cljs-example "0.1.0-SNAPSHOT"
  :description "Example for using ClojureScript in a web app"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [noir "1.2.1"]]
  ;lein-cljsbuild script fixed by http://bit.ly/JbZLr0
  :plugins [[lein-cljsbuild "0.1.8"]]
  :cljsbuild {
               :builds [{
                          ; The path to the top-level ClojureScript source directory:
                          :source-path "src-cljs"
                          ; The standard ClojureScript compiler options:
                          ; (See the ClojureScript compiler documentation for details.)
                          :compiler {
                                      :output-to "resources/public/js/main.js" ; default: main.js in current directory
                                      :optimizations :whitespace
                                      :pretty-print true}}]
               }
  :hooks [leiningen.cljsbuild]
  :main cljs-example.server)

