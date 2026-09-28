package K0;

import H0.q;
import H0.s;
import J.C0285q;
import K1.m;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import m2.C0880v;
import w1.C1386h;

/* loaded from: classes.dex */
public final class c extends z2.i implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4501j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, Object obj) {
        super(4);
        this.f4500i = i2;
        this.f4501j = obj;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f4500i) {
            case 0:
                int i2 = ((H0.i) obj3).f3398a;
                int i3 = ((H0.j) obj4).f3399a;
                d dVar = (d) this.f4501j;
                s b3 = ((H0.e) dVar.f4506e).b((q) obj, (H0.k) obj2, i2, i3);
                if (b3 instanceof s) {
                    Object obj5 = b3.f3415h;
                    z2.h.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                m mVar = new m(b3, dVar.f4511j);
                dVar.f4511j = mVar;
                Object obj6 = mVar.f4560c;
                z2.h.d(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            case 1:
                androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
                ((Number) obj2).intValue();
                C0285q c0285q = (C0285q) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0285q.g(aVar) ? 4 : 2;
                }
                if ((intValue & 131) == 130 && c0285q.A()) {
                    c0285q.P();
                } else {
                    ((y2.f) this.f4501j).i(aVar, c0285q, Integer.valueOf(intValue & 14));
                }
                return C0880v.f8657a;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                z2.h.c(sQLiteQuery);
                ((v1.e) this.f4501j).b(new C1386h(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
