package G1;

import C1.y;
import D.J;
import J2.InterfaceC0328z;
import K1.o;
import M2.C0339c;
import M2.InterfaceC0343g;
import M2.P;
import java.util.ArrayList;
import java.util.Iterator;
import m2.C0880v;
import n2.AbstractC0961m;
import n2.AbstractC0964p;
import q2.C1079j;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class j extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1242l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f1243m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f1244n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f1245o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, o oVar, e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1243m = iVar;
        this.f1244n = oVar;
        this.f1245o = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((j) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new j(this.f1243m, this.f1244n, this.f1245o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1242l;
        if (i2 == 0) {
            y.J(obj);
            i iVar = this.f1243m;
            iVar.getClass();
            o oVar = this.f1244n;
            z2.h.f(oVar, "spec");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iVar.f1241a) {
                if (((H1.d) obj2).b(oVar)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0964p.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                H1.d dVar = (H1.d) it.next();
                dVar.getClass();
                arrayList2.add(new C0339c(new H1.c(dVar, null), C1079j.f9784h, -2, 1));
            }
            InterfaceC0343g g3 = P.g(new h(0, (InterfaceC0343g[]) AbstractC0961m.X(arrayList2).toArray(new InterfaceC0343g[0])));
            J j3 = new J(this.f1245o, 2, oVar);
            this.f1242l = 1;
            if (g3.b(j3, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return C0880v.f8657a;
    }
}
