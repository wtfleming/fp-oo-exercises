(ns fp-oo.ch07-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch07 :refer :all]))

(deftest exercise-1-test
  (testing "exercise-1"
    (let [result (exercise-1)]
      (is (= result '(2)))
      (is (= (list? result) true)))))

(deftest exercise-2-test
  (testing "exercise-2"
    (let [result (exercise-2)]
      (is (= result '(6)))
      (is (= (list? result) true)))))

(deftest exercise-3-test
  (testing "exercise-3"
    (let [result (exercise-3)]
      (is (= result 7)))))

(deftest exercise-4-test
  (testing "exercise-4"
    (let [result (exercise-4)]
      (is (= result 13)))))

