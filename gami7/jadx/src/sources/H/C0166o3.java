package H;

import J.InterfaceC0258c0;
import J2.InterfaceC0328z;
import m.C0829d;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: H.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166o3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2975l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0829d f2976m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2977n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2978o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r.j f2979p;
    public final /* synthetic */ InterfaceC0258c0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166o3(C0829d c0829d, float f3, boolean z3, r.j jVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f2976m = c0829d;
        this.f2977n = f3;
        this.f2978o = z3;
        this.f2979p = jVar;
        this.q = interfaceC0258c0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0166o3) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0166o3(this.f2976m, this.f2977n, this.f2978o, this.f2979p, this.q, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f2975l;
        r.j jVar = this.f2979p;
        InterfaceC0258c0 interfaceC0258c0 = this.q;
        if (i2 == 0) {
            C1.y.J(obj);
            C0829d c0829d = this.f2976m;
            float f3 = ((O0.e) c0829d.f8426e.getValue()).f5138h;
            float f4 = this.f2977n;
            if (!O0.e.a(f3, f4)) {
                if (this.f2978o) {
                    r.j jVar2 = (r.j) interfaceC0258c0.getValue();
                    this.f2975l = 2;
                    if (I1.a(c0829d, f4, jVar2, jVar, this) == enumC1145a) {
                        return enumC1145a;
                    }
                } else {
                    O0.e eVar = new O0.e(f4);
                    this.f2975l = 1;
                    if (c0829d.e(eVar, this) == enumC1145a) {
                        return enumC1145a;
                    }
                }
            }
            return C0880v.f8657a;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1.y.J(obj);
        interfaceC0258c0.setValue(jVar);
        return C0880v.f8657a;
    }
}
