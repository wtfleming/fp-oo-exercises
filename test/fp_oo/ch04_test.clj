(ns fp-oo.ch04-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch04 :refer :all]))

(deftest getters
  (testing "getter functions"
    (let [point (make Point 1 2)]
      (is (= (send-to point :x) 1))
      (is (= (send-to point :y) 2)))))


(deftest shift-test
  (testing "shifting"
    (let [point (make Point 1 2)
          shifted-point (send-to point :shift 3 3)]
      (is (= (:x shifted-point 4)))
      (is (= (:y shifted-point 5))))))


(deftest add-test
  (testing "adds two points"
    (let [point (make Point 1 2)
          added-point (send-to point :add (make Point 3 5))]
      (is (= (send-to added-point :x) 4))
      (is (= (send-to added-point :y) 7)))))

