package com.giuseppefrattura.jmix.view.measure;

import com.giuseppefrattura.jmix.entity.Measure;
import com.giuseppefrattura.jmix.view.main.MainView;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.router.Route;
import io.jmix.core.EntityStates;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;

@Route(value = "measure/:id", layout = MainView.class)
@ViewController("gf_Measure.detail")
@ViewDescriptor("measure-detail-view.xml")
@EditedEntityContainer("measureDc")
public class MeasureDetailView extends StandardDetailView<Measure> {

    @ViewComponent
    private Date date;

    @ViewComponent
    private TypedTextField<Double> weight;

    @ViewComponent
    private TypedTextField<Double> vita;

    @ViewComponent
    private TypedTextField<Double> petto;

    @ViewComponent
    private TypedTextField<Double> coscia;

    @ViewComponent
    private TypedTextField<Double> polpaccio;

    @ViewComponent
    private TypedTextField<Double> vo2Max;

    @ViewComponent
    private MessageBundle messageBundle;

    @Autowired
    private EntityStates entityStates;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Subscribe
    public void onInit(final InitEvent event) {

    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Measure> event) {

    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        if (entityStates.isNew(getEditedEntity())) {

        }
    }

    @Subscribe
    public void onValidation(final ValidationEvent event) {
        if (entityStates.isNew(getEditedEntity())){

        }
    }

    @Subscribe
    protected void onBeforeSave(final BeforeSaveEvent event) {
        if (entityStates.isNew(getEditedEntity())) {

        }
    }
}