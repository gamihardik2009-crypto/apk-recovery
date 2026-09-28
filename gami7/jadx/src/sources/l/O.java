package l;

import J2.InterfaceC0328z;
import m.C0829d;
import m.C0838k;
import m.InterfaceC0840m;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class O extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f8146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f8147n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q f8148o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(N n3, long j3, Q q, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8146m = n3;
        this.f8147n = j3;
        this.f8148o = q;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((O) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new O(this.f8146m, this.f8147n, this.f8148o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        y2.e eVar;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8145l;
        Q q = this.f8148o;
        N n3 = this.f8146m;
        if (i2 == 0) {
            C1.y.J(obj);
            C0829d c0829d = n3.f8143a;
            O0.j jVar = new O0.j(this.f8147n);
            InterfaceC0840m interfaceC0840m = q.f8156u;
            this.f8145l = 1;
            obj = C0829d.b(c0829d, jVar, interfaceC0840m, null, this, 12);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        C0838k c0838k = (C0838k) obj;
        if (c0838k.f8507b == 2 && (eVar = q.f8158w) != null) {
            eVar.j(new O0.j(n3.f8144b), c0838k.f8506a.f8534i.getValue());
        }
        return C0880v.f8657a;
    }
}
