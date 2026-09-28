package u;

import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f10773a;

    /* renamed from: b, reason: collision with root package name */
    public final q[] f10774b;

    /* renamed from: c, reason: collision with root package name */
    public final s f10775c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10776d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10777e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10778f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10779g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10780h;

    public r(int i2, q[] qVarArr, s sVar, List list, boolean z3, int i3) {
        this.f10773a = i2;
        this.f10774b = qVarArr;
        this.f10775c = sVar;
        this.f10776d = list;
        this.f10777e = z3;
        this.f10778f = i3;
        int i4 = 0;
        for (q qVar : qVarArr) {
            i4 = Math.max(i4, qVar.f10767m);
        }
        this.f10779g = i4;
        int i5 = i4 + this.f10778f;
        this.f10780h = i5 >= 0 ? i5 : 0;
    }

    public final q[] a(int i2, int i3, int i4) {
        q[] qVarArr = this.f10774b;
        int length = qVarArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            q qVar = qVarArr[i5];
            int i8 = i6 + 1;
            int i9 = (int) ((C1271b) this.f10776d.get(i6)).f10667a;
            int i10 = this.f10775c.f10782b[i7];
            int i11 = this.f10773a;
            boolean z3 = this.f10777e;
            qVar.h(i2, i10, i3, i4, z3 ? i11 : i7, z3 ? i7 : i11);
            i7 += i9;
            i5++;
            i6 = i8;
        }
        return qVarArr;
    }
}
