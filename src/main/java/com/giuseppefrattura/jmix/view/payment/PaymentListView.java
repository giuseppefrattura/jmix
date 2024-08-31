package com.giuseppefrattura.jmix.view.payment;

import com.giuseppefrattura.jmix.entity.Payment;
import com.giuseppefrattura.jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "payments", layout = MainView.class)
@ViewController("gf_Payment.list")
@ViewDescriptor("payment-list-view.xml")
@LookupComponent("paymentDataGrid")
@DialogMode(width = "64em")
public class PaymentListView extends StandardListView<Payment> {
}