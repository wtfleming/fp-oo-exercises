(ns fp-oo.ch09)


;;; Exercise 1
(defn exercise-1-1 [coll]
  (map #(+ 2 %) coll))

(defn exercise-1-2 [coll]
  (map (partial + 2) coll))


;;; Exercise 2
(defn exercise-2 [coll]
  (let [separate (juxt filter remove)]
    (separate odd? coll)))

;;; Exercise 5
(defn exercise-5 [x]
  (let [my-atom (atom 0)]
    (swap! my-atom (fn [_] x))
    (deref my-atom)))

;;; Exercise 6
(defn always [value]
  "Returns a function that takes any number of args and returns value. See built in (constantly)"
  (fn [& _] value))

(defn exercise-6 []
  ((always 8) 1 'a :foo))

;;; Exercise 7
(defn isbn-check-sum [sequence]
  (reduce + (map *
              sequence
              (range 1 (inc (count sequence))))))

;(range 1 (inc (count [4 8 9 3 2])))
;; (isbn-checksum [4 8 9 3 2])
;; (+ (* 1 4)
;;    (* 2 8)
;;    (* 3 9)
;;    (* 4 3)
;;    (* 5 2))
;; Should = 69

;;; Exercise 8
(defn isbn? [val]
  (let [val-num-seq (map #(Integer. (str %)) val)]
    (zero? (rem (isbn-check-sum val-num-seq) 11))))

