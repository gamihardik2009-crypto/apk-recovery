package c2;

import C1.y;
import J.C0266g0;
import J.InterfaceC0258c0;
import J.W0;
import J2.InterfaceC0328z;
import java.time.LocalTime;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627d extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W0 f7333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7334m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7335n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7336o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0266g0 f7337p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0627d(W0 w02, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03, C0266g0 c0266g0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7333l = w02;
        this.f7334m = interfaceC0258c0;
        this.f7335n = interfaceC0258c02;
        this.f7336o = interfaceC0258c03;
        this.f7337p = c0266g0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0627d c0627d = (C0627d) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c0627d.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0627d(this.f7333l, this.f7334m, this.f7335n, this.f7336o, this.f7337p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        LocalTime of;
        LocalTime of2;
        y.J(obj);
        R1.a aVar = (R1.a) this.f7333l.getValue();
        if (aVar != null) {
            try {
                of = LocalTime.parse(aVar.f5467b);
            } catch (Exception unused) {
                of = LocalTime.of(9, 0);
            }
            this.f7334m.setValue(of);
            try {
                of2 = LocalTime.parse(aVar.f5468c);
            } catch (Exception unused2) {
                of2 = LocalTime.of(18, 0);
            }
            this.f7335n.setValue(of2);
            this.f7336o.setValue(Boolean.valueOf(aVar.f5469d));
            this.f7337p.h(aVar.f5470e);
        }
        return C0880v.f8657a;
    }
}
