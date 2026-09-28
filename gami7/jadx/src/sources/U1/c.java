package U1;

import C1.y;
import J2.InterfaceC0328z;
import Q1.p;
import R1.f;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import y2.e;

/* loaded from: classes.dex */
public final class c extends AbstractC1204i implements e {

    /* renamed from: l, reason: collision with root package name */
    public int f5784l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f5785m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f5786n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5785m = dVar;
        this.f5786n = str;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((c) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new c(this.f5785m, this.f5786n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5784l;
        d dVar = this.f5785m;
        if (i2 == 0) {
            y.J(obj);
            p pVar = dVar.f5788b;
            this.f5784l = 1;
            obj = pVar.d(this.f5786n, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.J(obj);
                return C0880v.f8657a;
            }
            y.J(obj);
        }
        f fVar = (f) obj;
        if (fVar != null) {
            if (fVar.f5501f == R1.c.f5485j) {
                p pVar2 = dVar.f5788b;
                f a3 = f.a(fVar, null, null, null, R1.c.f5483h, 0, null, 991);
                this.f5784l = 2;
                if (pVar2.g(a3, this) == enumC1145a) {
                    return enumC1145a;
                }
            }
        }
        return C0880v.f8657a;
    }
}
