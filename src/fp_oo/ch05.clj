(ns fp-oo.ch05)


;;; Exercise 1
(defn- method-from-instance [class message]
  (message (:__instance_methods__ class)))

(defn- apply-message-to [class instance message args]
  (apply (method-from-instance class message) instance args))

(defn- class-from-instance [instance]
  (eval (:__class_symbol__ instance)))

(defn make [class & args]
  (let [seeded {:__class_symbol__ (:__own_symbol__ class)}]
    (apply-message-to class seeded :add-instance-values args)))


(defn send-to [instance message & args]
  (let [class (class-from-instance instance)]
    (apply-message-to class instance message args)))



(def Point
{
  :__own_symbol__ 'Point
  :__instance_methods__
  {
    :add-instance-values (fn [this x y](assoc this :x x :y y)) ; Constructor
    :class (fn [this] (class-from-instance this))
    :class-name :__class_symbol__
    :shift (fn [this xinc yinc]
             (make Point (+ (:x this) xinc)
                         (+ (:y this) yinc)))
    :add (fn [this other]
           (send-to this :shift (:x other)
                                (:y other)))
   }
 })







;; For exercise 4
(def Holder
{
  :__own_symbol__ 'Holder
  :__instance_methods__
  {
    :add-instance-values (fn [this held]
                           (assoc this :held held))
  }
})
