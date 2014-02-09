(ns fp-oo.ch03)

(defn Point [x y]
  {:x y
   :y y
   :__class_symbol__ 'Point})

(def x :x)
(def y :y)
(def class-of :__class_symbol__)

(defn shift [this xinc yinc]
  (Point
    (+ (x this) xinc)
    (+ (y this) yinc)))


;;; Exercise 2
(defn add
  "Add two points, returning a third"
  [this other]
  (Point
    (+ (x this) (x other))
    (+ (y this) (y other))))

(defn add-shift [this other]
  (shift this (x other) (y other)))

;;; Exercise 3
(defn make [type & args]
  (apply type args))


(defn Triangle
  [point1 point2 point3]
  {:point1 point1
   :point2 point2
   :point3 point3
   :__class_symbol__ 'Triangle})


;;; Exercise 4
(def equal-triangles? =)


(def right-triangle (Triangle
                      (Point 0 0)
                      (Point 0 1)
                      (Point 1 0)))

(def equal-right-triangle (Triangle
                            (Point 0 0)
                            (Point 0 1)
                            (Point 1 0)))

(def different-triangle (Triangle
                          (Point 0 0)
                          (Point 0 10)
                          (Point 10 0)))


;;; Exercise 5
(defn valid-triangle? [& args]
  "Takes a list of Points and returns true if there are no duplicates"
  (and
    (= (distinct args) args)
    (= 3 (count args))))
