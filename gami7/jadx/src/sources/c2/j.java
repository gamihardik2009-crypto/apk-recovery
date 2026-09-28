package c2;

import H.D1;
import H.M5;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import java.time.LocalTime;
import m2.C0880v;

/* loaded from: classes.dex */
public final class j implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M5 f7372i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7373j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7374k;

    public /* synthetic */ j(M5 m5, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, int i2) {
        this.f7371h = i2;
        this.f7372i = m5;
        this.f7373j = interfaceC0258c0;
        this.f7374k = interfaceC0258c02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f7371h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    c0285q.U(-1006347484);
                    final M5 m5 = this.f7372i;
                    boolean g3 = c0285q.g(m5);
                    Object K3 = c0285q.K();
                    if (g3 || K3 == C0275l.f4150a) {
                        final InterfaceC0258c0 interfaceC0258c0 = this.f7373j;
                        final InterfaceC0258c0 interfaceC0258c02 = this.f7374k;
                        final int i2 = 0;
                        K3 = new y2.a() { // from class: c2.i
                            @Override // y2.a
                            public final Object c() {
                                switch (i2) {
                                    case 0:
                                        M5 m52 = m5;
                                        z2.h.f(m52, "$timePickerState");
                                        InterfaceC0258c0 interfaceC0258c03 = interfaceC0258c0;
                                        z2.h.f(interfaceC0258c03, "$resumeTime$delegate");
                                        InterfaceC0258c0 interfaceC0258c04 = interfaceC0258c02;
                                        z2.h.f(interfaceC0258c04, "$showResumePicker$delegate");
                                        interfaceC0258c03.setValue(LocalTime.of(m52.b(), m52.d()));
                                        interfaceC0258c04.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        M5 m53 = m5;
                                        z2.h.f(m53, "$timePickerState");
                                        InterfaceC0258c0 interfaceC0258c05 = interfaceC0258c0;
                                        z2.h.f(interfaceC0258c05, "$stopTime$delegate");
                                        InterfaceC0258c0 interfaceC0258c06 = interfaceC0258c02;
                                        z2.h.f(interfaceC0258c06, "$showStopPicker$delegate");
                                        interfaceC0258c05.setValue(LocalTime.of(m53.b(), m53.d()));
                                        interfaceC0258c06.setValue(Boolean.FALSE);
                                        break;
                                }
                                return C0880v.f8657a;
                            }
                        };
                        c0285q.e0(K3);
                    }
                    c0285q.r(false);
                    D1.j((y2.a) K3, null, false, null, null, null, null, null, null, AbstractC0626c.f7319a, c0285q, 805306368, 510);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    c0285q2.U(-1006318272);
                    final M5 m52 = this.f7372i;
                    boolean g4 = c0285q2.g(m52);
                    Object K4 = c0285q2.K();
                    if (g4 || K4 == C0275l.f4150a) {
                        final InterfaceC0258c0 interfaceC0258c03 = this.f7373j;
                        final InterfaceC0258c0 interfaceC0258c04 = this.f7374k;
                        final int i3 = 1;
                        K4 = new y2.a() { // from class: c2.i
                            @Override // y2.a
                            public final Object c() {
                                switch (i3) {
                                    case 0:
                                        M5 m522 = m52;
                                        z2.h.f(m522, "$timePickerState");
                                        InterfaceC0258c0 interfaceC0258c032 = interfaceC0258c03;
                                        z2.h.f(interfaceC0258c032, "$resumeTime$delegate");
                                        InterfaceC0258c0 interfaceC0258c042 = interfaceC0258c04;
                                        z2.h.f(interfaceC0258c042, "$showResumePicker$delegate");
                                        interfaceC0258c032.setValue(LocalTime.of(m522.b(), m522.d()));
                                        interfaceC0258c042.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        M5 m53 = m52;
                                        z2.h.f(m53, "$timePickerState");
                                        InterfaceC0258c0 interfaceC0258c05 = interfaceC0258c03;
                                        z2.h.f(interfaceC0258c05, "$stopTime$delegate");
                                        InterfaceC0258c0 interfaceC0258c06 = interfaceC0258c04;
                                        z2.h.f(interfaceC0258c06, "$showStopPicker$delegate");
                                        interfaceC0258c05.setValue(LocalTime.of(m53.b(), m53.d()));
                                        interfaceC0258c06.setValue(Boolean.FALSE);
                                        break;
                                }
                                return C0880v.f8657a;
                            }
                        };
                        c0285q2.e0(K4);
                    }
                    c0285q2.r(false);
                    D1.j((y2.a) K4, null, false, null, null, null, null, null, null, AbstractC0626c.f7322d, c0285q2, 805306368, 510);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
