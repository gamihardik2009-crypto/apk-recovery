package u;

import B1.C;
import java.util.List;
import p1.C1058a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10720a;

    /* renamed from: b, reason: collision with root package name */
    public final s f10721b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10722c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10723d;

    /* renamed from: e, reason: collision with root package name */
    public final l f10724e;

    /* renamed from: f, reason: collision with root package name */
    public final C1058a f10725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f10727h;

    public m(boolean z3, s sVar, int i2, int i3, l lVar, C1058a c1058a) {
        this.f10726g = z3;
        this.f10727h = sVar;
        this.f10720a = z3;
        this.f10721b = sVar;
        this.f10722c = i2;
        this.f10723d = i3;
        this.f10724e = lVar;
        this.f10725f = c1058a;
    }

    public final long a(int i2, int i3) {
        int i4;
        s sVar = this.f10721b;
        if (i3 == 1) {
            i4 = sVar.f10781a[i2];
        } else {
            int i5 = (i3 + i2) - 1;
            int[] iArr = sVar.f10782b;
            i4 = (iArr[i5] + sVar.f10781a[i5]) - iArr[i2];
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (this.f10720a) {
            if (i4 >= 0) {
                return C.L(i4, i4, 0, Integer.MAX_VALUE);
            }
            K1.f.R("width(" + i4 + ") must be >= 0");
            throw null;
        }
        if (i4 >= 0) {
            return C.L(0, Integer.MAX_VALUE, i4, i4);
        }
        K1.f.R("height(" + i4 + ") must be >= 0");
        throw null;
    }

    public final r b(int i2) {
        O.m q = this.f10725f.q(i2);
        List list = (List) q.f5121b;
        int size = list.size();
        int i3 = q.f5120a;
        int i4 = (size == 0 || i3 + size == this.f10722c) ? 0 : this.f10723d;
        q[] qVarArr = new q[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = (int) ((C1271b) list.get(i6)).f10667a;
            q a3 = this.f10724e.a(i3 + i6, i5, i7, i4, a(i5, i7));
            i5 += i7;
            qVarArr[i6] = a3;
        }
        return new r(i2, qVarArr, this.f10727h, (List) q.f5121b, this.f10726g, i4);
    }
}
