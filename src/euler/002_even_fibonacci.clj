(ns euler.002-even-fibonacci)

(def fib-seq
  (rest (iterate (fn [[x y]] [y (+ x y)]) [0 1])))

(let [N 4e6
      fib-seq (take-while (partial > N) (map second fib-seq))]
  (->> fib-seq
       (filter even?)
       (reduce +)))

;; 4613732
