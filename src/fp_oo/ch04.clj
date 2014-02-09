(ns fp-oo.ch04)

(defn make [type & args]
  (apply type args))

(defn send-to [object message & args]
  (apply (message (:__methods__ object)) object args))

(defn Point [x y]
  { :x x,
    :y y
    :__class_symbol__ 'Point
    :__methods__ {
                   :x :x ; getter function
                   :y :y
                   :class :__class_symbol__
                   :add (fn [this other]
                          (send-to this :shift (send-to other :x) (send-to other :y)))
                   :shift (fn [this xinc yinc]
                            (make Point
                              (+ (send-to this :x) xinc)
                              (+ (send-to this :y) yinc)))}})
