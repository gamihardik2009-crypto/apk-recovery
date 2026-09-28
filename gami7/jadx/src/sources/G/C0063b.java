package G;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: G.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063b extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f1140n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r.n f1141o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063b(o oVar, c cVar, r.n nVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1139m = oVar;
        this.f1140n = cVar;
        this.f1141o = nVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0063b) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0063b(this.f1139m, this.f1140n, this.f1141o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1138l;
        r.n nVar = this.f1141o;
        c cVar = this.f1140n;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                o oVar = this.f1139m;
                this.f1138l = 1;
                if (oVar.a(this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
            cVar.f1146m.remove(nVar);
            return C0880v.f8657a;
        } catch (Throwable th) {
            cVar.f1146m.remove(nVar);
            throw th;
        }
    }
}
