package W1;

import H.B1;
import J.InterfaceC0258c0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import m2.C0880v;

/* renamed from: W1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0393n implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6054i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6055j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6056k;

    public /* synthetic */ C0393n(InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03) {
        this.f6053h = 0;
        this.f6054i = interfaceC0258c0;
        this.f6055j = interfaceC0258c02;
        this.f6056k = interfaceC0258c03;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6053h) {
            case 0:
                InterfaceC0258c0 interfaceC0258c0 = this.f6054i;
                z2.h.f(interfaceC0258c0, "$showFabMenu$delegate");
                InterfaceC0258c0 interfaceC0258c02 = this.f6055j;
                z2.h.f(interfaceC0258c02, "$clientToEdit$delegate");
                InterfaceC0258c0 interfaceC0258c03 = (InterfaceC0258c0) this.f6056k;
                z2.h.f(interfaceC0258c03, "$showAddEditDialog$delegate");
                interfaceC0258c0.setValue(Boolean.FALSE);
                interfaceC0258c02.setValue(null);
                interfaceC0258c03.setValue(Boolean.TRUE);
                break;
            case 1:
                B1 b12 = (B1) this.f6056k;
                z2.h.f(b12, "$datePickerState");
                InterfaceC0258c0 interfaceC0258c04 = this.f6054i;
                z2.h.f(interfaceC0258c04, "$selectedDate$delegate");
                InterfaceC0258c0 interfaceC0258c05 = this.f6055j;
                z2.h.f(interfaceC0258c05, "$showDatePicker$delegate");
                Long b3 = b12.b();
                if (b3 != null) {
                    interfaceC0258c04.setValue(Instant.ofEpochMilli(b3.longValue()).atZone(ZoneId.systemDefault()).toLocalDate());
                }
                interfaceC0258c05.setValue(Boolean.FALSE);
                break;
            default:
                y2.e eVar = (y2.e) this.f6056k;
                z2.h.f(eVar, "$onConfirm");
                InterfaceC0258c0 interfaceC0258c06 = this.f6054i;
                z2.h.f(interfaceC0258c06, "$selectedDate$delegate");
                InterfaceC0258c0 interfaceC0258c07 = this.f6055j;
                z2.h.f(interfaceC0258c07, "$startFromScratch$delegate");
                String localDate = ((LocalDate) interfaceC0258c06.getValue()).toString();
                z2.h.e(localDate, "toString(...)");
                Boolean bool = (Boolean) interfaceC0258c07.getValue();
                bool.booleanValue();
                eVar.j(localDate, bool);
                break;
        }
        return C0880v.f8657a;
    }

    public /* synthetic */ C0393n(Object obj, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, int i2) {
        this.f6053h = i2;
        this.f6056k = obj;
        this.f6054i = interfaceC0258c0;
        this.f6055j = interfaceC0258c02;
    }
}
