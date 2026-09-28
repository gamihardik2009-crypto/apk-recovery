package H;

import J2.InterfaceC0328z;
import m.C0829d;
import m.InterfaceC0840m;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class U3 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2044l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0829d f2045m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2046n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0840m f2047o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.a f2048p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(C0829d c0829d, boolean z3, InterfaceC0840m interfaceC0840m, y2.a aVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f2045m = c0829d;
        this.f2046n = z3;
        this.f2047o = interfaceC0840m;
        this.f2048p = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((U3) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new U3(this.f2045m, this.f2046n, this.f2047o, this.f2048p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f2044l;
        if (i2 == 0) {
            C1.y.J(obj);
            Float f3 = new Float(this.f2046n ? 1.0f : 0.0f);
            this.f2044l = 1;
            if (C0829d.b(this.f2045m, f3, this.f2047o, null, this, 12) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        this.f2048p.c();
        return C0880v.f8657a;
    }
}
