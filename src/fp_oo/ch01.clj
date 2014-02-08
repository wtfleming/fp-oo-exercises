(ns fp-oo.ch01)

(defn exercise-1
  "Return second element of a list"
  [x]
  (nth x 1))

(defn exercise-2-1
  "Return third element of a list"
  [x]
  (nth x 2))

(defn exercise-2-2
  "Return third element of a list"
  [x]
  (first (rest (rest x))))
