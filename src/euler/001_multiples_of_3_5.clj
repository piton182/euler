(ns euler.001-multiples-of-3-5)

(let [n 1000
      nats [3 5]]
  (->> nats
       (map #(range 0 n %))
       (apply concat)
       (into (hash-set))
       (reduce +)))

(let [n 1000
      nats [3 5]]
  (->> (range n)
       (reduce (fn [acc x]
                 (if (some #(= 0 (mod x %)) nats)
                   (+ acc x)
                   acc)))))

(let [n 1000
      nats [3 5]]
  (loop [i 0
         result 0]
    (if (< i n)
      (recur (inc i)
             (if (some #(= 0 (mod i %)) nats)
               (+ result i)
               result))
      result)))
