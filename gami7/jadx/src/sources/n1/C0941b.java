package n1;

import android.content.Context;
import android.content.ContextWrapper;
import s.AbstractC1166e;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941b extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0941b f9016j = new C0941b(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0941b f9017k = new C0941b(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0941b f9018l = new C0941b(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C0941b f9019m = new C0941b(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C0941b f9020n = new C0941b(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C0941b f9021o = new C0941b(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C0941b f9022p = new C0941b(1, 6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9023i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0941b(int i2, int i3) {
        super(i2);
        this.f9023i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f9023i) {
            case 0:
                Context context = (Context) obj;
                z2.h.f(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                z2.h.f(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                s sVar = (s) obj;
                z2.h.f(sVar, "destination");
                v vVar = sVar.f9088i;
                if (vVar == null || vVar.f9105r != sVar.f9093n) {
                    return null;
                }
                return vVar;
            case 3:
                s sVar2 = (s) obj;
                z2.h.f(sVar2, "destination");
                v vVar2 = sVar2.f9088i;
                if (vVar2 == null || vVar2.f9105r != sVar2.f9093n) {
                    return null;
                }
                return vVar2;
            case 4:
                s sVar3 = (s) obj;
                z2.h.f(sVar3, "it");
                return Integer.valueOf(sVar3.f9093n);
            case AbstractC1166e.f10138f /* 5 */:
                s sVar4 = (s) obj;
                z2.h.f(sVar4, "it");
                return sVar4.f9088i;
            default:
                s sVar5 = (s) obj;
                z2.h.f(sVar5, "it");
                if (!(sVar5 instanceof v)) {
                    return null;
                }
                v vVar3 = (v) sVar5;
                return vVar3.h(vVar3.f9105r, vVar3, false);
        }
    }
}
