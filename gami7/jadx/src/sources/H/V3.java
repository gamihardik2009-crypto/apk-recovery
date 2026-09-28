package H;

import J2.InterfaceC0328z;
import m.C0829d;
import m.InterfaceC0840m;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class V3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2083l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0829d f2084m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2085n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0840m f2086o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3(C0829d c0829d, boolean z3, InterfaceC0840m interfaceC0840m, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f2084m = c0829d;
        this.f2085n = z3;
        this.f2086o = interfaceC0840m;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((V3) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new V3(this.f2084m, this.f2085n, this.f2086o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f2083l;
        if (i2 == 0) {
            C1.y.J(obj);
            Float f3 = new Float(this.f2085n ? 1.0f : 0.8f);
            this.f2083l = 1;
            if (C0829d.b(this.f2084m, f3, this.f2086o, null, this, 12) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return C0880v.f8657a;
    }
}
