(ns fp-oo.ch01)

;;; Exercise 1
(defn exercise-1
  "Return second element of a list"
  [x]
  (nth x 1))

;;; Exercise 2
(defn exercise-2-1
  "Return third element of a list"
  [x]
  (nth x 2))

(defn exercise-2-2
  "Return third element of a list"
  [x]
  (first (rest (rest x))))

;;; Exercise 3
(defn add-squares
  "Return the sum of the squares of numbers"
  [& x]
  (apply + (map #(* % %) x)))

;;; Exercise 4
(defn bizarre-factorial
  "Factorial using neither recursion or iteration"
  [x]
  (apply * (range 1 (inc x))))

(defn bizarre-factorial-2
  "Factorial using neither recursion or iteration"
  [x]
  (reduce * (range 1 (inc x))))

(defn factorial-recursion
  [x]
  (loop [x x
         acc 1]
    (if (= 0 x)
      acc
      (recur (dec x) (* x acc)))))

;;; Exercise 6
(defn prefix-of?
  "Returns true if the elements in the candidate are the first elements in the sequence"
  [candidate sequence]
(= (take (count candidate) sequence) candidate))

;;; Exercise 7
(defn tails
  "Returns a sequence of successively smaller subsequences of the argument"
  [coll]
  (let [inc-count-coll (inc (count coll))]
    (map drop
      (range inc-count-coll)
      (repeat inc-count-coll coll))))

