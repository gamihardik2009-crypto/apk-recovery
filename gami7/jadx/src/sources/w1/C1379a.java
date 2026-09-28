package w1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1379a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11440b;

    public /* synthetic */ C1379a(int i2, Object obj) {
        this.f11439a = i2;
        this.f11440b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f11439a) {
            case 0:
                v1.e eVar = (v1.e) this.f11440b;
                z2.h.f(eVar, "$query");
                z2.h.c(sQLiteQuery);
                eVar.b(new C1386h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                y2.g gVar = (y2.g) this.f11440b;
                z2.h.f(gVar, "$tmp0");
                return (Cursor) gVar.g(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
