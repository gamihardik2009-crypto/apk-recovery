package o1;

import D.J;
import J.C0266g0;
import J.InterfaceC0258c0;
import J.W0;
import M2.InterfaceC0343g;
import java.util.List;
import java.util.concurrent.CancellationException;
import m2.C0880v;
import n1.C0945f;
import n2.AbstractC0961m;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class s extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9281l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9282m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f9283n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0266g0 f9284o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W0 f9285p;
    public final /* synthetic */ InterfaceC0258c0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i iVar, C0266g0 c0266g0, W0 w02, InterfaceC0258c0 interfaceC0258c0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9283n = iVar;
        this.f9284o = c0266g0;
        this.f9285p = w02;
        this.q = interfaceC0258c0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((s) m((InterfaceC0343g) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        s sVar = new s(this.f9283n, this.f9284o, this.f9285p, this.q, interfaceC1073d);
        sVar.f9282m = obj;
        return sVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C0945f c0945f;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9281l;
        InterfaceC0258c0 interfaceC0258c0 = this.q;
        i iVar = this.f9283n;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                InterfaceC0343g interfaceC0343g = (InterfaceC0343g) this.f9282m;
                C0266g0 c0266g0 = this.f9284o;
                c0266g0.h(0.0f);
                W0 w02 = this.f9285p;
                C0945f c0945f2 = (C0945f) AbstractC0961m.N((List) w02.getValue());
                z2.h.c(c0945f2);
                iVar.g(c0945f2);
                iVar.g((C0945f) ((List) w02.getValue()).get(((List) w02.getValue()).size() - 2));
                J j3 = new J(interfaceC0258c0, 6, c0266g0);
                this.f9282m = c0945f2;
                this.f9281l = 1;
                if (interfaceC0343g.b(j3, this) == enumC1145a) {
                    return enumC1145a;
                }
                c0945f = c0945f2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0945f = (C0945f) this.f9282m;
                C1.y.J(obj);
            }
            interfaceC0258c0.setValue(Boolean.FALSE);
            iVar.e(c0945f, false);
        } catch (CancellationException unused) {
            interfaceC0258c0.setValue(Boolean.FALSE);
        }
        return C0880v.f8657a;
    }
}
