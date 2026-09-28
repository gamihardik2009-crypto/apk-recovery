package m;

import java.util.concurrent.CancellationException;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825b extends AbstractC1204i implements y2.c {

    /* renamed from: l, reason: collision with root package name */
    public C0841n f8405l;

    /* renamed from: m, reason: collision with root package name */
    public z2.o f8406m;

    /* renamed from: n, reason: collision with root package name */
    public int f8407n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0829d f8408o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8409p;
    public final /* synthetic */ InterfaceC0836i q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f8410r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.c f8411s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825b(C0829d c0829d, Object obj, InterfaceC0836i interfaceC0836i, long j3, y2.c cVar, InterfaceC1073d interfaceC1073d) {
        super(1, interfaceC1073d);
        this.f8408o = c0829d;
        this.f8409p = obj;
        this.q = interfaceC0836i;
        this.f8410r = j3;
        this.f8411s = cVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        long j3 = this.f8410r;
        y2.c cVar = this.f8411s;
        return new C0825b(this.f8408o, this.f8409p, this.q, j3, cVar, (InterfaceC1073d) obj).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        z2.o oVar;
        C0841n c0841n;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8407n;
        int i3 = 1;
        C0829d c0829d = this.f8408o;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                c0829d.f8424c.f8535j = (AbstractC0845s) c0829d.f8422a.f8600a.l(this.f8409p);
                c0829d.f8426e.setValue(this.q.e());
                c0829d.f8425d.setValue(Boolean.TRUE);
                C0841n c0841n2 = c0829d.f8424c;
                C0841n c0841n3 = new C0841n(c0841n2.f8533h, c0841n2.f8534i.getValue(), AbstractC0831e.i(c0841n2.f8535j), c0841n2.f8536k, Long.MIN_VALUE, c0841n2.f8538m);
                z2.o oVar2 = new z2.o();
                InterfaceC0836i interfaceC0836i = this.q;
                long j3 = this.f8410r;
                C0823a c0823a = new C0823a(c0829d, c0841n3, this.f8411s, oVar2, 0);
                this.f8405l = c0841n3;
                this.f8406m = oVar2;
                this.f8407n = 1;
                if (AbstractC0831e.c(c0841n3, interfaceC0836i, j3, c0823a, this) == enumC1145a) {
                    return enumC1145a;
                }
                oVar = oVar2;
                c0841n = c0841n3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = this.f8406m;
                c0841n = this.f8405l;
                C1.y.J(obj);
            }
            if (!oVar.f11905h) {
                i3 = 2;
            }
            C0829d.a(c0829d);
            return new C0838k(i3, c0841n);
        } catch (CancellationException e3) {
            C0829d.a(c0829d);
            throw e3;
        }
    }
}
