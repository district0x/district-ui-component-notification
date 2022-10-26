(ns district.ui.component.notification
  (:require [district.ui.notification.subs :as subs]
            [re-frame.core :as re-frame]
            [reagent.core :as r]))

(defn notification []
  (fn [{:keys [:action-button-props] :as props}]
    (let [{:keys [:open? :message :action-href]} @(re-frame/subscribe [::subs/notification])]
      [:div.notification
       (r/merge-props
        {:class (when open? "open")}
        (dissoc props :action-button-props))
       [:div.notification-message message]
       (when action-href
         [:a
          (r/merge-props
            {:class "action-button"
             :href action-href}
            (dissoc action-button-props :text))
          [:button {:type "button"}
           (or (:text action-button-props) "Show Me")]])])))
