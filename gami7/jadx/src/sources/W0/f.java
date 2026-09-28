package W0;

import C1.y;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends y {

    /* renamed from: f, reason: collision with root package name */
    public final Class f5897f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f5898g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f5899h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f5900i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f5901j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f5902k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f5903l;

    public f() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = S(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = T(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f5897f = cls;
        this.f5898g = constructor;
        this.f5899h = method2;
        this.f5900i = method3;
        this.f5901j = method4;
        this.f5902k = method5;
        this.f5903l = method;
    }

    public static Method S(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void N(Object obj) {
        try {
            this.f5902k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public Typeface O(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f5897f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f5903l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean P(Object obj) {
        try {
            return ((Boolean) this.f5901j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean Q() {
        Method method = this.f5899h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object R() {
        try {
            return this.f5898g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method T(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // C1.y
    public final Typeface o(Context context, Z0.b[] bVarArr, int i2) {
        Typeface O3;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!Q()) {
            Z0.b u3 = u(bVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(u3.f6393a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(u3.f6395c).setItalic(u3.f6396d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        int i3 = 0;
        for (Z0.b bVar : bVarArr) {
            if (bVar.f6397e == 0) {
                Uri uri = bVar.f6393a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, K1.f.J(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object R3 = R();
        if (R3 == null) {
            return null;
        }
        int length = bVarArr.length;
        boolean z3 = false;
        while (i3 < length) {
            Z0.b bVar2 = bVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(bVar2.f6393a);
            if (byteBuffer != null) {
                if (!((Boolean) this.f5900i.invoke(R3, byteBuffer, Integer.valueOf(bVar2.f6394b), null, Integer.valueOf(bVar2.f6395c), Integer.valueOf(bVar2.f6396d ? 1 : 0))).booleanValue()) {
                    N(R3);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            N(R3);
            return null;
        }
        if (P(R3) && (O3 = O(R3)) != null) {
            return Typeface.create(O3, i2);
        }
        return null;
    }
}
