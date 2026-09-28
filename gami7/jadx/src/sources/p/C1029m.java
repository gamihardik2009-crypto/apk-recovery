package p;

import J2.InterfaceC0328z;
import java.util.concurrent.CancellationException;
import m.AbstractC0831e;
import m.C0823a;
import m.C0841n;
import m.C0850x;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029m extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public z2.p f9638l;

    /* renamed from: m, reason: collision with root package name */
    public C0841n f9639m;

    /* renamed from: n, reason: collision with root package name */
    public int f9640n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f9641o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1031n f9642p;
    public final /* synthetic */ InterfaceC1012d0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029m(float f3, C1031n c1031n, InterfaceC1012d0 interfaceC1012d0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9641o = f3;
        this.f9642p = c1031n;
        this.q = interfaceC1012d0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1029m) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1029m(this.f9641o, this.f9642p, this.q, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        float f3;
        z2.p pVar;
        C0841n c0841n;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9640n;
        if (i2 == 0) {
            C1.y.J(obj);
            f3 = this.f9641o;
            if (Math.abs(f3) > 1.0f) {
                pVar = new z2.p();
                pVar.f11906h = f3;
                z2.p pVar2 = new z2.p();
                C0841n b3 = AbstractC0831e.b(f3, 28);
                try {
                    C1031n c1031n = this.f9642p;
                    C0850x c0850x = c1031n.f9647a;
                    C0823a c0823a = new C0823a(pVar2, this.q, pVar, c1031n, 2);
                    this.f9638l = pVar;
                    this.f9639m = b3;
                    this.f9640n = 1;
                    if (AbstractC0831e.e(b3, c0850x, false, c0823a, this) == enumC1145a) {
                        return enumC1145a;
                    }
                } catch (CancellationException unused) {
                    c0841n = b3;
                    pVar.f11906h = ((Number) c0841n.a()).floatValue();
                    f3 = pVar.f11906h;
                    return new Float(f3);
                }
            }
            return new Float(f3);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0841n = this.f9639m;
        pVar = this.f9638l;
        try {
            C1.y.J(obj);
        } catch (CancellationException unused2) {
            pVar.f11906h = ((Number) c0841n.a()).floatValue();
            f3 = pVar.f11906h;
            return new Float(f3);
        }
        f3 = pVar.f11906h;
        return new Float(f3);
    }
}
