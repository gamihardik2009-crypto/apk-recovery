package w1;

import O2.v;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.io.Closeable;
import n2.AbstractC0946A;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1380b implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f11441i = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f11442j = new String[0];

    /* renamed from: h, reason: collision with root package name */
    public final SQLiteDatabase f11443h;

    public C1380b(SQLiteDatabase sQLiteDatabase) {
        z2.h.f(sQLiteDatabase, "delegate");
        this.f11443h = sQLiteDatabase;
    }

    public final void a() {
        this.f11443h.beginTransaction();
    }

    public final void b() {
        this.f11443h.beginTransactionNonExclusive();
    }

    public final C1387i c(String str) {
        z2.h.f(str, "sql");
        SQLiteStatement compileStatement = this.f11443h.compileStatement(str);
        z2.h.e(compileStatement, "delegate.compileStatement(sql)");
        return new C1387i(compileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11443h.close();
    }

    public final void d() {
        this.f11443h.endTransaction();
    }

    public final void e(String str) {
        z2.h.f(str, "sql");
        this.f11443h.execSQL(str);
    }

    public final void f(Object[] objArr) {
        z2.h.f(objArr, "bindArgs");
        this.f11443h.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean g() {
        return this.f11443h.inTransaction();
    }

    public final boolean h() {
        return this.f11443h.isOpen();
    }

    public final boolean i() {
        SQLiteDatabase sQLiteDatabase = this.f11443h;
        z2.h.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor j(String str) {
        z2.h.f(str, "query");
        return l(new v(str));
    }

    public final Cursor l(v1.e eVar) {
        z2.h.f(eVar, "query");
        Cursor rawQueryWithFactory = this.f11443h.rawQueryWithFactory(new C1379a(1, new K0.c(2, eVar)), eVar.d(), f11442j, null);
        z2.h.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final Cursor o(v1.e eVar, CancellationSignal cancellationSignal) {
        z2.h.f(eVar, "query");
        String d3 = eVar.d();
        String[] strArr = f11442j;
        z2.h.c(cancellationSignal);
        C1379a c1379a = new C1379a(0, eVar);
        SQLiteDatabase sQLiteDatabase = this.f11443h;
        z2.h.f(sQLiteDatabase, "sQLiteDatabase");
        z2.h.f(d3, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c1379a, d3, strArr, null, cancellationSignal);
        z2.h.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public final void r() {
        this.f11443h.setTransactionSuccessful();
    }

    public final int s(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f11441i[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder().apply(builderAction).toString()");
        C1387i c3 = c(sb2);
        AbstractC0946A.f(c3, objArr2);
        return c3.f11465i.executeUpdateDelete();
    }
}
