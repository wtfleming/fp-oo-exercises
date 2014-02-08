(ns fp-oo.ch01-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch01 :refer :all]))


(deftest exercise-1-test
  (testing "returns the second element"
    (is (= (exercise-1 [0 1 2 3]) 1))))

(deftest exercise-2-1-test
  (testing "returns the third element"
    (is (= (exercise-2-1 [0 1 2 3]) 2))))

(deftest exercise-2-2-test
  (testing "returns the third element"
    (is (= (exercise-2-2 [0 1 2 3]) 2))))
