(ns fp-oo.ch06)


;;; Exercise 1 + 2

(defn factorial [n]
  (loop [n n
         acc 1]
    (if (= 0 n)
      acc
      (recur (dec n) (* acc n)))))

;;; Exercise 3
(defn add-seq [coll]
  "Add a sequence of numbers together"
  (loop [coll coll
         acc 0]
    (if (empty? coll)
      acc
      (recur (rest coll) (+ acc (first coll))))))

;; Alternate solution
(defn add-seq-2 [coll]
  (apply + coll))

(defn add-seq-3 [coll]
  (reduce + coll))
