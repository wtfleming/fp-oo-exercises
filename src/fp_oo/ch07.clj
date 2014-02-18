(ns fp-oo.ch07)

;;; Exercise 1
(defn exercise-1 []
  (->
    [1]
    (first)
    (inc)
    (list)))

;;; Exercise 2
(defn exercise-2 []
  (->
    [1]
    (first)
    (inc)
    (* 3)
    (list)))


;;; Exercise 3
(defn double-number [n] (* 2 n))

(defn exercise-3 []
  (-> 3
    (double-number)
    (inc)))

;;; Exercise 4

(defn exercise-4 []
  (-> 1
    (+ 2)
    (* 3)
    (+ 4)))
