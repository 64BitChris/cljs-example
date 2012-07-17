(ns cljs-example.protocols
  (use [cljs-example.show]))


(defrecord TestRecord [x y])

(def t (map->TestRecord {:x 1 :y 2}))

(extend-protocol Show
  TestRecord
  (show [this] {:x (:x this) :y (:y this)}))


(show t)




