package A0;

import C0.C0024g;
import m2.C0880v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class o extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f67j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i2) {
        super(1);
        this.f66i = i2;
        this.f67j = str;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        String str = this.f67j;
        switch (this.f66i) {
            case 0:
                w.d((k) obj, str);
                break;
            case 1:
                F2.d[] dVarArr = w.f123a;
                x xVar = t.f98d;
                F2.d dVar = w.f123a[2];
                xVar.a((k) obj, str);
                break;
            case 2:
                k kVar = (k) obj;
                w.e(kVar);
                w.d(kVar, str);
                break;
            case 3:
                F2.d[] dVarArr2 = w.f123a;
                x xVar2 = t.f98d;
                F2.d dVar2 = w.f123a[2];
                xVar2.a((k) obj, str);
                break;
            case 4:
                k kVar2 = (k) obj;
                w.g(kVar2, new C0024g(str, null, 6));
                w.f(kVar2, 0);
                break;
            case AbstractC1166e.f10138f /* 5 */:
                k kVar3 = (k) obj;
                w.e(kVar3);
                w.d(kVar3, str);
                break;
            case AbstractC1166e.f10136d /* 6 */:
                k kVar4 = (k) obj;
                w.g(kVar4, new C0024g(str, null, 6));
                w.f(kVar4, 0);
                break;
            case 7:
                k kVar5 = (k) obj;
                w.d(kVar5, str);
                w.f(kVar5, 5);
                break;
            case 8:
                F2.d[] dVarArr3 = w.f123a;
                ((k) obj).e(t.f93D, str);
                break;
            case AbstractC1166e.f10135c /* 9 */:
                k kVar6 = (k) obj;
                w.h(kVar6);
                w.d(kVar6, str);
                break;
            case AbstractC1166e.f10137e /* 10 */:
                w.d((k) obj, str);
                break;
            case 11:
                k kVar7 = (k) obj;
                w.f(kVar7, 3);
                w.d(kVar7, str);
                break;
            default:
                w.d((k) obj, str);
                break;
        }
        return c0880v;
    }
}
