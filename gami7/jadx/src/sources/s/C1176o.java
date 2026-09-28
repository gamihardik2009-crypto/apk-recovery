package s;

import java.util.List;
import n2.C0971w;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* renamed from: s.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176o implements InterfaceC1094H {

    /* renamed from: b, reason: collision with root package name */
    public static final C1176o f10162b = new C1176o(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1176o f10163c = new C1176o(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10164a;

    public /* synthetic */ C1176o(int i2) {
        this.f10164a = i2;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        switch (this.f10164a) {
            case 0:
                return interfaceC1096J.C(O0.a.j(j3), O0.a.i(j3), C0971w.f9166h, C1175n.f10158j);
            default:
                return interfaceC1096J.C(O0.a.f(j3) ? O0.a.h(j3) : 0, O0.a.e(j3) ? O0.a.g(j3) : 0, C0971w.f9166h, C1175n.f10160l);
        }
    }
}
