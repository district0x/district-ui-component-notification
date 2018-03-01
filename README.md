# district-ui-component-notification

Clojurescript [mount](https://github.com/tolitius/mount) + [re-frame](https://github.com/Day8/re-frame) component for a district UI, that provides [reagent](https://github.com/reagent-project/reagent) UI component for notifications.

## Installation

Add `[district0x/district-ui-component-notification "1.0.0"]` into your project.clj.<br/><br/>
Include `[district.ui.component.notification]` in your CLJS file.

## Module dependencies

This UI component assumes you have following UI modules installed in your app:
* [district-ui-notification](https://github.com/district0x/district-ui-notification)

## district.ui.component.notification
This namespace contains reagent UI component to display active (current) notification.
It subscribes to the `::notification` sub of the [district-ui-notification](https://github.com/district0x/district-ui-notification) module.

```clojure
(ns my-district
  (:require [reagent.core :as r]
            [re-frame.core :as re-frame]
            [mount.core :as mount]
            [district.ui.notification]
            [district.ui.notification.events :as events]
            [district.ui.component.notification :as notification]))

(defn main-panel []
  [:div.app
    [notification/notification]])

(defn ^:export init []
  (-> (mount/with-args {:district-ui-notification {:default-show-duration 1000}})
      (mount/start))
  (r/render [main-panel] (.getElementById js/document "app"))
    (re-frame/dispatch-sync [::events/show "foobar"]))
```
