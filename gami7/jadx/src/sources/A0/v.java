package A0;

import java.util.List;
import m2.C0880v;

/* loaded from: classes.dex */
public final class v extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.a f122j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(y2.a aVar, int i2) {
        super(1);
        this.f121i = i2;
        this.f122j = aVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        boolean z3 = true;
        C0880v c0880v = C0880v.f8657a;
        y2.a aVar = this.f122j;
        switch (this.f121i) {
            case 0:
                List list = (List) obj;
                Float f3 = (Float) aVar.c();
                if (f3 == null) {
                    z3 = false;
                } else {
                    list.add(f3);
                }
                break;
            case 1:
                break;
            case 2:
                z2.h.f(obj, "it");
                break;
            case 3:
                g gVar = new g(((Number) aVar.c()).floatValue(), new E2.a(0.0f, 1.0f), 0);
                F2.d[] dVarArr = w.f123a;
                x xVar = t.f97c;
                F2.d dVar = w.f123a[1];
                xVar.a((k) obj, gVar);
                break;
            default:
                aVar.c();
                break;
        }
        return c0880v;
    }
}
